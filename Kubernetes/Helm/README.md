Helm values

YAML is a flexible format, and values may be nested deeply or flattened.

Nested:
    server:
      name: nginx
      port: 80

Flat:
    serverName: nginx
    serverPort: 80

Helm's built-in variables begin with an uppercase letter:
    .Release.Name, .Capabilities.KubeVersion.

Helm's user-defined values should begin with a lowercase letter, and words should be separated with camelcase
    chicken: true
    chickenNoodleSoup: true

Value sources:
    A chart's values.yaml file
    A values file supplied by helm install -f or helm upgrade -f
    The values passed to a --set or --set-string flag on helm install or helm upgrade

Use --set:
    servers:
      - name: foo
        port: 80
      - name: bar
        port: 81

   --set servers[0].port=80

    servers:
        foo:
            port: 80
        bar:
            port: 81
    
   --set servers.foo.port=80
   
Document values.yaml
    